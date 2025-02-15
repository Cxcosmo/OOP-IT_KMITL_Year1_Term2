public class Player {
    private String name;
    private String team;

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setTeam(String t) {
        this.team = t;
    }
    public boolean isSameTeam(Player p){
        if(p.getTeam().equals(team)){
            return true;
        }
        return false;
    }
}
