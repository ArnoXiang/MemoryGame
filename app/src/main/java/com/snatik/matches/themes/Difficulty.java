package com.snatik.matches.themes;
import com.snatik.matches.R;
import com.snatik.matches.fragments.DifficultySelectFragment;


public class Difficulty {

    private int id;
    private int highStars;
    private String title;//BEGINNER//MASTER///ETC
    private String time = "BEST: -";//TIME TAKEN IN LEVEL

    public Difficulty(int id, int highStars, String time, DifficultySelectFragment context) {

        if (id == 1) {
            title = context.getString(R.string.Difficulty_beginner);
        } else if (id == 2) {
            title = context.getString(R.string.Difficulty_easy);
        } else if (id == 3) {
            title = context.getString(R.string.difficulty_medium);
        } else if (id == 4) {
            title = context.getString(R.string.difficulty_hard);
        } else if (id == 5) {
            title = context.getString(R.string.difficulty_hardest);
        } else if (id == 6) {
            title = context.getString(R.string.difficulty_master);
        }
        this.id = id;
        this.highStars = highStars;
        this.time = time; 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHighStars() {
        return highStars;
    }

    public void setHighStars(int highStars) {
        this.highStars = highStars;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
