 class Robot implements Participant{
    private String name;
    Robot(String name){
        this.name = name;
    }

     @Override
     public void run(int length) {
         System.out.println("Робот "+name+" пробіг "+length+" м.");
     }

     @Override
     public void jump(int height) {
         System.out.println("Робот "+name+" стрибнув "+height+" м.");
     }
 }
