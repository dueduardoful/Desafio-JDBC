package aplicacao;

import model.dao.DaoFactory;
import model.dao.ItensDaVendaDao;
import model.entities.ItensDaVenda;

public class Programa {

	public static void main(String[] args) {
		
		ItensDaVendaDao itemDao = DaoFactory.createItensDaVenda();
		
		System.out.println(" ======== FIND BY ID ==============");
		ItensDaVenda item = itemDao.findById(1);
		System.out.println(item);
		
//		System.out.println(" ======== INSERT ==============");
//		ItensDaVenda newVenda = new ItensDaVenda(null, 8, 2, 240.00);
//		itemDao.insert(newVenda);
//		System.out.println("Inserido novo item de venda");
		
//		System.out.println(" ======== UPDATE ==============");
//		item = itemDao.findById(1);
//		item.setSubtotal(100.00);
//		itemDao.update(item);
//		System.out.println("Update completado!");
		
		System.out.println("===========MAIOR VALOR=============");
		ItensDaVenda item2 = (ItensDaVenda) itemDao.maiorValor();
		System.out.println(item2);
	}
}
