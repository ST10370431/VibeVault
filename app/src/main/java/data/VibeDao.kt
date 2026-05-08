package data

interface VibeDao {
    @Dao
    interface VibeDao {
        @Insert
        suspend fun insertExpense(expense: Expense)

        @Query("SELECT * FROM expenses WHERE date BETWEEN :start AND :end ORDER BY date DESC")
        fun getExpensesByPeriod(start: Long, end: Long): Flow<List<Expense>>

        @Query("SELECT * FROM users WHERE username = :user AND password = :pass LIMIT 1")
        suspend fun login(user: String, pass: String): User?
    }
}