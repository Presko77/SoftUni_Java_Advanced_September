package workout;

import java.util.ArrayList;
import java.util.List;

public class Workout {
    private List<Exercise> exercises;
    private String type;
    private int exerciseCount;

    public Workout(String type, int exerciseCount) {
        this.type = type;
        this.exerciseCount = exerciseCount;
        this.exercises = new ArrayList<>();
    }


    public void addExercise(Exercise exercise) {
        if (this.exercises.size() < this.exerciseCount) {
            this.exercises.add(exercise);
        }
    }

    public boolean removeExercise(String name, String muscle) {
        for (Exercise currentExercise : exercises) {
            if (currentExercise.getName().equals(name) && currentExercise.getMuscle().equals(muscle)){
                exercises.remove(currentExercise);
                return true;
        }
        }
        return false;
    }

    public Exercise getExercise(String name, String muscle) {
        for (Exercise currentExercise : exercises) {
            if (currentExercise.getName().equals(name) && currentExercise.getMuscle().equals(muscle)){
                return currentExercise;
            }
        }
        return null;
    }

    public Exercise getMostBurnedCaloriesExercise() {
        Exercise exercise = null;
        int calories = 0;

        if (this.exercises.size() > 0) {
            for (Exercise ex : this.exercises) {
                if (ex.getBurnedCalories() > calories) {
                    calories = ex.getBurnedCalories();
                }
            }
            for (Exercise ex : this.exercises) {
                if (ex.getBurnedCalories() == calories) {
                    exercise = ex;
                    break;
                }
            }
        }
        return exercise;
    }

    public int getExerciseCount() {
        return exerciseCount;
    }

    public String getStatistics() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Workout type: %s", this.type));
        builder.append(System.lineSeparator());

        for (Exercise exercise : this.exercises) {
            builder.append(exercise);
            builder.append(System.lineSeparator());
        }

        return builder.toString().trim();
    }
}
