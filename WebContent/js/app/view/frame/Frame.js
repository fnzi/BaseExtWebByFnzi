Ext.define('AM.view.frame.Frame', {
	id : 'frame',
	alias : 'widget.frame',
	extend : 'Ext.container.Viewport',
	layout : 'border',
	items : [ {
		id : 'frame_north',
		region : 'north',
		layout : 'fit',
		height : 78,
		bodyStyle : 'background-color:#FFFF33',
		border : true
	}, {
		id : 'frame_west',
		region : 'west',
		width : 330,
		split : true,
		collapsible : true,
		bodyStyle : 'background-color:#FFCC33',
		border : false,
		layout : 'fit'
	}, {
		id : 'frame_center',
		region : 'center',
		bodyStyle : 'background-color:#FFCC33',
		border : false,
		layout : 'fit'
	}, {
		id : 'frame_south',
		region : 'south',
		bodyStyle : 'background-color:#CCFF33',
		layout : 'fit',
		border : true,
		height : 30
	} ]
});