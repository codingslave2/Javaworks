package Inheritance.shop;

public class Shop1 extends HeadShop {
	// 생성자
	
	public Shop1() {	
		
	}
	
	@Override
	public void sellDoenjangJJige() {
		System.out.println("된장찌게: 6,500원");
	}
	
	@Override
	public void sellKimchiJJige() {
		System.out.println("김치찌게: 7,000원");
	}
	
	@Override
	public void sellBibimBap() {
		System.out.println("비빔밥: 7,000원");
	}
	
	
	
}
