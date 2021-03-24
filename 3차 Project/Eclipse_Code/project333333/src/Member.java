
public class Member {
	private String id;
	private String name;
	private String room;
	private String tel;
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getRoom() {
		return room;
	}
	public String getTel() {
		return tel;
	}
	public Member(String id, String name, String room, String tel) {
		super();
		this.id = id;
		this.name = name;
		this.room = room;
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", room=" + room + ", tel=" + tel + "]";
	}
	

	
}
