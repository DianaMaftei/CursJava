class OuterMember {
    private int i  = 6;
    public int y = 7;
    public static int testStatic = 8;
    
    class InnerMember {
        public int y = 2;
            
        public void access() {
            System.out.println(i); // putem accesa campuri private din clasa exterioara
            System.out.println(testStatic);
            System.out.println(y);
            System.out.println(OuterMember.this.y); // pt a accesa din clasa exterioara un camp cu acelasi nume 
            
            OuterMember.InnerMember inner1 = new InnerMember();
            InnerMember inner2 = new InnerMember();
        }
    }  
}

class InheritInnerMember extends OuterMember.InnerMember {
    
        public InheritInnerMember(OuterMember outer) {
            outer.super();
        }
        
        @Override
        public void access() {
        }
    }