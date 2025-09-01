package aplicação;

import dominio.Pessoa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceUnit;

public class Programa {

	public static void main(String[] args) {

		// Instancia a configuração do persistence.xml
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");

		// Com essa instanciação terá uma conexão com o banco de dados e toda persistência implementada
		EntityManager em = emf.createEntityManager();
		/*
		 * //Iniciar a transação com o banco de Dados 
		 * em.getTransaction().begin();
		 * //persist é o que pega o método e joga para o banco de dados 
		 * em.persist(p1);
		 * em.persist(p2); 
		 * em.persist(p3); 
		 * //Confirmar a transação com o banco de Dados
		 * em.getTransaction().commit();
		 */
		
		//JPA tem uma busca pelo ID
		/*
		 * Pessoa p = em.find(Pessoa.class, 2);
		 * 
		 * System.out.println(p);
		 */
		
		//JPA quando deseja apagar alguma informação do BD
		Pessoa p = em.find(Pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("Finalizado, pai!");
		
		em.close();
		emf.close();
	}

}
