package magacin;

import java.util.LinkedList;

import interfejs.MagacinInterface;

public class Magacin implements MagacinInterface {
	private LinkedList<Artikal> artikli=new LinkedList<Artikal>();
	@Override
	public void dodajArtikal(Artikal artikal) {
		// TODO Auto-generated method stub
		if(artikal!=null && !artikli.contains(artikal)) {
			artikli.add(artikal);
		}
		else if(artikal!=null) {
			for(Artikal a:artikli) {
				if(a.equals(artikal)) {
					a.setKolicina(a.getKolicina()+artikal.getKolicina());
				}
			}
		}

	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		if(artikal!=null) {
			for(Artikal a:artikli) {
				if(a.equals(artikal)) {
					a.setKolicina(a.getKolicina()-artikal.getKolicina());
				}
			}
		}

	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		for(Artikal a:artikli) {
			if(a.getSifra()==sifra) {
				return a;
			}
		}
		return null;
	}

}
