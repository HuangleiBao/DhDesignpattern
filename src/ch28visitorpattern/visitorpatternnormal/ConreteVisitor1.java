package ch28visitorpattern.visitorpatternnormal;

public class ConreteVisitor1 extends Vistor {
	@Override
	public void visitConcreteElementA(Element concreteEelmentsA) {
		// TODO Auto-generated method stub
		System.out.printf("\n%s �� %s ���ʣ�",concreteEelmentsA.getClass().getName(),this.getClass().getName());
	}
	@Override
	public void visitConcreteElementB(Element concreteEelmentsB) {
		// TODO Auto-generated method stub
		System.out.printf("\n%s �� %s ���ʣ�",concreteEelmentsB.getClass().getName(),this.getClass().getName());
	}
}
