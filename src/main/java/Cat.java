 class Cat implements Participant{
    private String name;
    public Cat(String name){
        this.name = name;
    }
     @Override
     public void run(int leng) {
         System.out.println("Кіт "+name+" пробіг "+leng+"м.");
     }

     @Override
     public void jump(int height) {
         System.out.println("Кіт "+name+" стрибнув "+height+" м.");
     }
 }
