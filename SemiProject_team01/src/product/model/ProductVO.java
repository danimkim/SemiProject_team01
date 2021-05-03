package product.model;


public class ProductVO {

	
	private int pnum;         // 제품번호(Primary Key)
	private String pname;     // 제품명
	private int fk_cnum;      // 카테고리코드(Foreign Key)의 시퀀스번호 참조
	private String pcompany;  // 제조회사명
	private String pimage1;   // 제품이미지1   이미지파일명
	private String pimage2;   // 제품이미지2   이미지파일명 
	private int price;        // 제품 정가
	private int saleprice;    // 제품 판매가(할인해서 팔 것이므로)
	private int fk_snum;      // 'NEW', 'BEST', 'SALE' 에 대한 스펙번호인 시퀀스번호를 참조
	private String pcontent;  // 제품설명  varchar2는 varchar2(4000) 최대값이므로	                                         
	
	// 자식테이블(tbl_product)에 부모테이블인 category와 spec 테이블이 필요하다
	private CategoryVO categvo; // 카테고리VO 
	private SpecVO spvo;        // 스펙VO 
  
  public ProductVO() { }
	
	public ProductVO(int pnum, String pname, int fk_cnum, String pcompany, String pimage1, String pimage2,
			int price, int saleprice, int fk_snum, String pcontent, int point) {
	
		this.pnum = pnum;
		this.pname = pname;
		this.fk_cnum = fk_cnum;
		this.pcompany = pcompany;
		this.pimage1 = pimage1;
		this.pimage2 = pimage2;
		this.price = price;
		this.saleprice = saleprice;
		this.fk_snum = fk_snum;
		this.pcontent = pcontent;
		this.point = point;
	}
	
	public CategoryVO getCategvo() {
		return categvo;
	}
	public void setCategvo(CategoryVO categvo) {
		this.categvo = categvo;
	}
	public SpecVO getSpvo() {
		return spvo;
	}
	public void setSpvo(SpecVO spvo) {
		this.spvo = spvo;
	}
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getFk_cnum() {
		return fk_cnum;
	}
	public void setFk_cnum(int fk_cnum) {
		this.fk_cnum = fk_cnum;
	}
	public String getPcompany() {
		return pcompany;
	}
	public void setPcompany(String pcompany) {
		this.pcompany = pcompany;
	}
	public String getPimage1() {
		return pimage1;
	}
	public void setPimage1(String pimage1) {
		this.pimage1 = pimage1;
	}
	public String getPimage2() {
		return pimage2;
	}
	public void setPimage2(String pimage2) {
		this.pimage2 = pimage2;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSaleprice() {
		return saleprice;
	}
	public void setSaleprice(int saleprice) {
		this.saleprice = saleprice;
	}
	public int getFk_snum() {
		return fk_snum;
	}
	public void setFk_snum(int fk_snum) {
		this.fk_snum = fk_snum;
	}
	public String getPcontent() {
		return pcontent;
	}
	public void setPcontent(String pcontent) {
		this.pcontent = pcontent;
	}
	
	
	
}
