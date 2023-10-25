 class Wall implements Obstacle{
    private int heigth;
    public Wall(int heigth){
        this.heigth= heigth;
    }
    @Override
 public void overcome(Participant participant){
    participant.jump(heigth);
}
}
