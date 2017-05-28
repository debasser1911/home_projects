package Circus;


public class Artist {
    private String name;
    private String surName;
    private double earnedMoney;
    protected int numOfPerformances;
    protected double extraBonusForRisk;


    public Artist(String name, String surName) {
        this.name = name;
        this.surName = surName;
        this.earnedMoney = 0.0;
        this.numOfPerformances = 0;
        this.extraBonusForRisk = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public double getEarnedMoney() {
        return earnedMoney;
    }

    public void setEarnedMoney(double earnedMoney) {
        this.earnedMoney = earnedMoney;
    }

    public int getNumOfPerformances() {
        return numOfPerformances;
    }

    public void setNumOfPerformances(int numOfPerformances) {
        this.numOfPerformances = numOfPerformances;
    }

    public double getExtraBonusForRisk() {
        return extraBonusForRisk;
    }

    public void setExtraBonusForRisk(double extraBonusForRisk) {
        this.extraBonusForRisk = extraBonusForRisk;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", earnedMoney=" + earnedMoney +
                ", numOfPerformances=" + numOfPerformances +
                ", extraBonusForRisk=" + extraBonusForRisk +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist artist = (Artist) o;
        return surName != null ? surName.equals(artist.surName) : artist.surName == null;
    }


    /*    public void showArtists() {

        for (int i = 0; i < artists.size(); i++) {
            System.out.println(artists.get(i));
        }
    }*/

}
