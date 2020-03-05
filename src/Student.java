public class Student {
  int rating;
  private String name;

  public static int count = 0;
  public static int totalRating = 0;

  public Student() {
    count++;
  }

  public Student(String name) {
    this.name = name;
    count++;
  }
  public Student(String name, int rating) {
    this.name = name;
    this.rating = rating;
    count++;
    totalRating += rating;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
    totalRating += rating;
  }

  public boolean betterStudent(Student student) {
    return this.rating > student.rating;
  }

  public static double getAvgRating() {
    double averageRating = 0.0;
    if (count > 0) averageRating = totalRating / (double) count;
    return averageRating;
  }

  public void changeRating(int rating) {
    totalRating -= this.rating;
    this.rating = rating;
    setRating(rating);
  }

  public static void removeStudent(Student student) {
    count--;
    totalRating -= student.rating;
  }

  @Override
  public String toString() {
    return getName() + " " + getRating();
  }

  public static void main (String[] args) {
    // Create 3 students
    Student student1 = new Student("John", 20);
    Student student2 = new Student("Jason", 23);
    Student student3 = new Student("Jacob", 32);

    // Display average rating of all students
    System.out.println("Average students rating is: " + getAvgRating());

    // change rating of the some student
    student1.changeRating(36);

    //Display new average rating
    System.out.println("Average students rating is: " + getAvgRating());
  }
}
