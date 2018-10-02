package ch28.visitorpatternnormal;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectStructure o=new ObjectStructure();
		o.attach(new ConcreteElementA());
		o.attach(new ConcreteElementB());
		
		ConreteVisitor1 v1=new ConreteVisitor1();
		ConreteVisitor2 v2=new ConreteVisitor2();
		
		o.display(v1);
		o.display(v2);
	}

}