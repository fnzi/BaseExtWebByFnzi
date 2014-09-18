Ext.Loader.setConfig({
	enabled : true
});

Ext.application({
	name : 'AM',
	appFolder : extPath + '/js/app',
	controllers : [ 'frame.FrameControl' ],
	launch : function() {
		Ext.create('AM.view.frame.Frame');
	}
});
