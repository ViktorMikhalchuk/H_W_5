 class Human implements Participant{
    private String name;
    public Human(String name){
        this.name = name;
    }

     @Override
     public void run(int length) {
         System.out.println("Людина "+name+" пробігла "+length+" м.");

     }

     @Override
     public void jump(int height) {
         System.out.println("Людина "+name+" стрибнула на "+height+" м.");
     }
 }
