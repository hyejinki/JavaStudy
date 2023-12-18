package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct memger2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] memberConstructs = {member1, memger2};

        for (MemberConstruct s : memberConstructs) {
            System.out.println("이름: " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade);
        }
    }
}
