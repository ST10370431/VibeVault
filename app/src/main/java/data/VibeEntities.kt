package data

class VibeEntities {@Entity(tableName = "users")
data class User(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val username: String,
    val password: String,
    val minGoal: Double,
    val maxGoal: Double
)

    @Entity(tableName = "expenses")
    data class Expense(
        @PrimaryKey(autoGenerate = true) val id: Int = 0,
        val amount: Double,
        val date: Long, // Use timestamp for easier period filtering
        val description: String,
        val category: String,
        val photoUri: String? = null
    )
}