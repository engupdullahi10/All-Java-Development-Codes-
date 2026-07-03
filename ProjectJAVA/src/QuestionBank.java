public class QuestionBank {
    public String[] questions = {
            "Java is a ______ ?",
            "Which keyword is used to inherit a class?",
            "Which data type stores decimal values?",
            "Which language is used for Android development?",
            "Which company developed the C# language?"
    };

    public String[][] options = {
            {"OS", "Language", "Browser", "Game"},
            {"this", "super", "extends", "implements"},
            {"int", "double", "char", "boolean"},
            {"Python", "Java", "C#", "HTML"},
            {"Microsoft", "Google", "Apple", "IBM"}
    };

    public int[] correctAnswers = {2, 3, 2, 2, 1};

    public int getTotalQuestions() {
        return questions.length;
    }
}
