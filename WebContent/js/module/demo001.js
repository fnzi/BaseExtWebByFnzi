Ext.onReady(function(){
var store = new Ext.data.Store({
		fields : [ 'name', 'sex' ],
		// pageSize: 20,
		proxy : {
			type : 'ajax',
			url : extPath + '/js/data/getuser.jsp',
			reader : {
				type : 'json', // 返回数据类型为json格式
				root : 'rows', // 数据（json格式）
				totalProperty : 'total' // 数据总条数
			}
		},
		autoLoad : true
	});

	var grid = new Ext.grid.Panel({
		region : 'center',
		store : store,
		selModel : Ext.create('Ext.selection.CheckboxModel'),
		columns : [ {
			text : '姓名',
			dataIndex : 'name'
		}, {
			text : '性别',
			dataIndex : 'sex'
		} ],
		bbar : [ {
			xtype : 'pagingtoolbar',
			store : store,
			displayMsg : '显示 {0} - {1} 条，共计 {2} 条',
			emptyMsg : "没有数据",
			beforePageText : "当前页",
			afterPageText : "共{0}页",
			displayInfo : true
		} ]
	});

	var view = new Ext.Viewport({
		layout : 'border',
		items : [ grid ]
	});

});