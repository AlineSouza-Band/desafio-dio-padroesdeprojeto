package singleton;

/**
 * *Singleton "Lazy Holder"
 * 
 * @see <a href="https://stackeoverflow.com/a/24018148">Referencia</a>
 * @author AlineSouza-Band
 *
 */
public class SingletonLazyHolder {
	
	private static class InstanceHolder {

	public static SingletonLazyHolder instancia = new SingletonLazyHolder() ;
	}
	private SingletonLazyHolder() {
		super();
	}
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
		}
		
		
	}
