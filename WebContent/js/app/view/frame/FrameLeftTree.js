Ext.define('AM.view.frame.FrameLeftTree', {
	extend : 'Ext.tree.Panel',
	// title:'<center>功能模块</center>',
	fields : [ 'text', 'url' ],
	border : true,
	id : 'FrameTreePanel',
	// iconCls:'application_side_list',
	alias : 'widget.FrameTreePanel',
	store : 'frame.FrameTreeStore'

});