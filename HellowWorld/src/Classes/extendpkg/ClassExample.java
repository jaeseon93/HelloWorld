package Classes.extendpkg;

public class ClassExample {
	public static void main(String[] args) {
		Object[] objAry = new Object[10];
		Object obj = null;
		obj = new Friend();
		System.out.println(obj.hashCode());

		if (obj instanceof Friend) {  //형변환 체크
			Friend frnd = (Friend) obj;
			System.out.println(frnd.getName() + frnd.getPhone());
		}
		
		objAry[0] = new Friend();
		
		Friend[] fArray = new Friend[10];
		fArray[0] = new UnivFriend("","","","");
		fArray[1] = new ComFriend("","","","");
		fArray[2] = new UnivFriend();
		
		System.out.println(fArray[0].equals(fArray[1]));
	}
}
