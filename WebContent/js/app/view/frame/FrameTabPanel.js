Ext.define('AM.view.frame.FrameTabPanel', {
	extend : 'Ext.tab.Panel',
	id : 'frame_tab_panel',
	layout : 'fit',
	activeTab : 0,
	items : [ {
		xtype : 'panel',
		id : 'govInfoWelcomePage',
		title : '欢迎页',
		html : '欢迎使用信息管理系统'
	} ]

});