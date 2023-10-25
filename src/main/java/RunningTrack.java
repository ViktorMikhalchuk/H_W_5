 class RunningTrack implements Obstacle{
    private int length;
    public RunningTrack(int length){
        this.length= length;
    }

public void overcome(Participant participant){
    participant.run(length);
}

}
