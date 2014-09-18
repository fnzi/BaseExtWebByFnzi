Ext.define('AM.store.frame.FrameTreeStore', {
	extend : 'Ext.data.TreeStore',
	autoLoad : true,
	proxy : {
		type : 'ajax',
		url : extPath + '/js/data/frameTreeStore.jsp'
	},
	fields : [ 'text', 'url' ],
	root : {
		text : '功能模块',
		id : '0',
		expanded : true
	},
	folderSort : true,
	sorters : [ {
		property : 'id',
		direction : 'ASC'
	} ]
});