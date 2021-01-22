package kg.kurmanjan.quizapp.ui.history;

import kg.kurmanjan.quizapp.core.IHistoryStorage;
import kg.kurmanjan.quizapp.model.QuizResult;

public class HistoryStorage implements IHistoryStorage {
    @Override
    public QuizResult getQuizResult(int id) {
        return null;
    }

    @Override
    public int saveQuizResult(QuizResult quizResult) {
        return 0;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void deleteAll() {

    }
}
