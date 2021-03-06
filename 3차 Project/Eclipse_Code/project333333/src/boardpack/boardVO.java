package boardpack;


public class boardVO {
	private int num;
	private String title;
	private String name;
	private String day;
	private int click;	
	private String content;
	private int groupno;
	private int groupod;
	private int depth;
	
	
	
	public boardVO() {
		super();
	}
	
	

	
	
	public boardVO(int num, String title, String name, String day, int click, String content, int groupno,
			int groupod) {
		super();
		this.num = num;
		this.title = title;
		this.name = name;
		this.day = day;
		this.click = click;
		this.content = content;
		this.groupno = groupno;
		this.groupod = groupod;
	}

	//조건별 검색 생성자(내용만 빼고 다 가지고옴)
	

	public boardVO(int num, String title, String name, String day, int click, int groupno, int groupod, int depth) {
		super();
		this.num = num;
		this.title = title;
		this.name = name;
		this.day = day;
		this.click = click;
		this.groupno = groupno;
		this.groupod = groupod;
		this.depth = depth;
	}


	public boardVO(int num, String title, String name, String day, int click, String content, int groupno, int groupod,
			int depth) {
		super();
		this.num = num;
		this.title = title;
		this.name = name;
		this.day = day;
		this.click = click;
		this.content = content;
		this.groupno = groupno;
		this.groupod = groupod;
		this.depth = depth;
	}
	
	
	public boardVO(int num, String title, String name, String day, int click, String content) {
		super();
		this.num = num;
		this.title = title;
		this.name = name;
		this.day = day;
		this.click = click;
		this.content = content;
	}
	//게시판 목록 불러오는 constructor
	public boardVO(int num, String title, String name, String day, int click) {
		super();
		this.num = num;
		this.title = title;
		this.name = name;
		this.day = day;
		this.click = click;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public int getClick() {
		return click;
	}
	public void setClick(int click) {
		this.click = click;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getGroupno() {
		return groupno;
	}
	public void setGroupno(int groupno) {
		this.groupno = groupno;
	}
	public int getGroupod() {
		return groupod;
	}
	public void setGroupod(int groupod) {
		this.groupod = groupod;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	

}
