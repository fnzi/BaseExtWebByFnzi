package groovyimport cn.tj.baseextweb.fw.dao.GenericDaoImpl

class GenericDaoByGroovyImpl extends GenericDaoImpl {	def methodMissing(String name,args) {		if(name.startsWith("findUserBy")) {			return findByHqlDeal(name, args)		} else {			return "run methodMissing: unknown method $name(${args.join(',')})"		}	}		private findByHqlDeal(String name,args) {		def attr = name.replace("findUserBy", "");				def hql = "select model from User model where $attr = " + args[0];				println hql;        hql	}}
