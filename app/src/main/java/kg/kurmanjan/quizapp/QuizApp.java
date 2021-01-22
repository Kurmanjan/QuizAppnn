package kg.kurmanjan.quizapp;

import android.app.Application;

import kg.kurmanjan.quizapp.core.IHistoryStorage;
import kg.kurmanjan.quizapp.data.IQuizApiClient;
import kg.kurmanjan.quizapp.data.QuizApiClient;
import kg.kurmanjan.quizapp.ui.history.HistoryStorage;

public class QuizApp extends Application {

    public static IQuizApiClient quizApiClient;
    public static IHistoryStorage historyStorage;
    public static QuizRepository repository;


    @Override
    public void onCreate() {
        super.onCreate();

        quizApiClient = new QuizApiClient();
        historyStorage = new HistoryStorage();
        repository = new QuizRepository(quizApiClient, historyStorage);
    }
}
