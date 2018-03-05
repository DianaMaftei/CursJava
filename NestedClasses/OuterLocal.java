class OuterLocal {
    public int i =  10;
        
    public void access() {
        int i = 1;
        //i++; // effectively final, nu va compila daca vom incerca sa modificam variabila
        
        class InnerLocal {
              
            public int getSum() {
                return i + OuterLocal.this.i +1;
            }
        }
        
        System.out.println(new InnerLocal().getSum());
        //i++; // effectively final, nu va compila daca vom incerca sa modificam variabila
    }
    
    
}

