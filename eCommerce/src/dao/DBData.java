package dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import dao.Connection;
import model.CategoryModel;

public class DBData {
	
	public void saveCategory(CategoryModel category) {

		Connection con = new Connection();

		Session session = con.getSessionFactory().openSession();

		Transaction transaction = session.beginTransaction();
		session.save(category);
		transaction.commit();
		System.out.println("Inserted...");
	}
	
	public CategoryModel getCategoryById(int id) {
		String query = "from CategoryModel category where category.id="+id;
		Connection con = new Connection();
		Session session = con.getSessionFactory().openSession();

		Query queryExecuteable = session.createQuery(query);
		CategoryModel bookModel = (CategoryModel) queryExecuteable.list().get(0);

		return bookModel;
	}
	
	public List<CategoryModel> getAllCategories() {
		List<CategoryModel> categoryModel=new ArrayList<>();
		String query = "from CategoryModel book";
		Connection con = new Connection();
		Session session = con.getSessionFactory().openSession();

		Query queryExecuteable = session.createQuery("from CategoryModel Category");
		categoryModel=queryExecuteable.list();
		return categoryModel;
	}
	
	public List<CategoryModel> getAllCategoryModels()
	{
		List<CategoryModel> categoryModel=new ArrayList<>();
		
		Connection con=new Connection();
		Session session=con.getSessionFactory().openSession();
		
		Query query=session.createQuery("from CategoryModel category");
		System.out.println("line 56 dbdata  "+query);
		categoryModel=query.list();
		
		return categoryModel;
	}

	public void updateCategory(CategoryModel category) {
		Connection con = new Connection();

		Session session = con.getSessionFactory().openSession();

		Transaction transaction = session.beginTransaction();
		session.update(category);
		transaction.commit();
		System.out.println("Updated...");
	}

	public void deleteCategory(CategoryModel categoryModel) {
		
		Connection con = new Connection();

		Session session = con.getSessionFactory().openSession();

		Transaction transaction = session.beginTransaction();
		session.delete(categoryModel);
		transaction.commit();
		System.out.println("Deleted...");
	}
	
}
