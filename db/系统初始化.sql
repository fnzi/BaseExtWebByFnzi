CREATE TABLE `tab_role` (
  `rid` int(11) NOT NULL auto_increment,
  `rname` varchar(255) default NULL,
  `starttime` varchar(255) default NULL,
  `endtime` varchar(255) default NULL,
  PRIMARY KEY  (`rid`)
);

CREATE TABLE `tab_function` (
  `fid` int(11) NOT NULL auto_increment,
  `fname` varchar(255) default NULL,
  `forder` int(11) default NULL,
  `furl` varchar(255) default NULL,
  `level` varchar(255) default NULL,
  `pid` int(11) default NULL,
  PRIMARY KEY  (`fid`),
  KEY `pid` (`pid`),
  CONSTRAINT `tab_function_ibfk_1` FOREIGN KEY (`pid`) REFERENCES `tab_function` (`fid`)
);

CREATE TABLE `ref_role_function` (
  `rfid` int(11) NOT NULL auto_increment,
  `rid` int(11) default NULL,
  `fid` int(11) default NULL,
  PRIMARY KEY  (`rfid`),
  KEY `rid` (`rid`),
  KEY `fid` (`fid`),
  CONSTRAINT `ref_role_function_ibfk_1` FOREIGN KEY (`rid`) REFERENCES `tab_role` (`rid`),
  CONSTRAINT `ref_role_function_ibfk_2` FOREIGN KEY (`fid`) REFERENCES `tab_function` (`fid`)
);

CREATE TABLE `tab_user` (
  `uid` int(11) NOT NULL auto_increment,
  `username` varchar(255) default NULL,
  `password` varchar(255) default NULL,
  `starttime` varchar(255) default NULL,
  `endtime` varchar(255) default NULL,
  `rid` int(11) default NULL,
  PRIMARY KEY  (`uid`),
  KEY `rid` (`rid`),
  CONSTRAINT `tab_user_ibfk_1` FOREIGN KEY (`rid`) REFERENCES `tab_role` (`rid`)
);

