package TiposPagos;

import Singleton.Database;

public class ServerVisa {
	private static ServerVisa databaseVisa;
	
	private ServerVisa() {
		
	}
	
	public static ServerVisa GetInstance() {
		if(databaseVisa == null) {
			return new ServerVisa();
		}
		else
		{
			return databaseVisa;
		}
	}

}
