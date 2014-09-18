Ext.define('AM.controller.frame.FrameControl', {
	extend : 'Ext.app.Controller',
	views : [ 'frame.Frame', 'frame.FrameLeftTree', 'frame.FrameTabPanel' ],
	stores : [ 'frame.FrameTreeStore' ],
	models : [],
	refs : [ {
		ref : 'frame',
		selector : 'frame'
	}, {
		ref : 'frame_tab_panel',
		selector : 'frame_tab_panel'
	} ],
	init : function() {
		this.control({
			'viewport' : {
				afterrender : this.initFrameUI
			},
			'FrameTreePanel' : {
				itemclick : function(view, rec, item, index, e) {
					if (rec.get('leaf') === true) {
						var moduleTabId = 'tab_' + rec.get('id');
						var frame_center = Ext.getCmp('frame_tab_panel');
						var tab = frame_center.getComponent(moduleTabId);
						if (!tab) {// 添加
							var size = 2;
							if (frame_center.items.length <= size) {
								tab = frame_center.add(Ext.create(
										"Ext.panel.Panel", {
											id : moduleTabId,
											title : rec.get('text'),
											closable : true,
											html : '<iframe scrolling="auto" frameborder="0" width="100%" height="100%" src="'+ extPath + rec.get('url') + '"></iframe>'
//											autoLoad : {
//												url : extPath + rec.get('url'),
//												method : "GET",
//												scripts : true,
//												// scope : this,
//												nocache : true
//											}
										}));
							} else {
								Ext.Msg.alert("警告：", "最多只能打开" + size
										+ "个tab页，请关闭其他tab。");
							}
						}
						frame_center.setActiveTab(tab);
					}
				}
			}
		});
	},
	// 初始化框架UI
	initFrameUI : function() {
		var top = Ext.create("AM.view.frame.FrameTop");
		this.getFrame().getComponent('frame_north').add(top);
		var tree = Ext.create("AM.view.frame.FrameLeftTree");
		this.getFrame().getComponent('frame_west').add(tree);
		var tabpanel = Ext.create("AM.view.frame.FrameTabPanel");
		this.getFrame().getComponent('frame_center').add(tabpanel);
		var bottom = Ext.create("AM.view.frame.FrameBottom");
		this.getFrame().getComponent('frame_south').add(bottom);
	}
});