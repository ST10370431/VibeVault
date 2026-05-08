package com.example.vibevault

import android.graphics.Bitmap
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.vibevault.data.Expense
import com.example.vibevault.databinding.ActivityAddExpenseBinding // Make sure viewBinding is on!
import kotlinx.coroutines.launch

class AddExpenseActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddExpenseBinding

    // The Camera Launcher
    private val takePhoto = registerForActivityResult(ActivityResultContracts.TakePicturePreview()) { bitmap ->
        if (bitmap != null) {
            binding.imgPreview.setImageBitmap(bitmap)
            // In a real app, you'd save this bitmap to a file and store the URI
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddExpenseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSnap.setOnClickListener {
            takePhoto.launch(null)
        }

        binding.btnSave.setOnClickListener {
            saveToDatabase()
        }
    }

    private fun saveToDatabase() {
        val amount = binding.etAmount.text.toString().toDoubleOrNull() ?: 0.0
        val category = binding.etCategory.text.toString()

        if (amount > 0 && category.isNotEmpty()) {
            // This is the "brain" - saving it in the background
            lifecycleScope.launch {
                // Here you would call your Room DAO to insert
                // AppDatabase.getInstance(this).vibeDao().insertExpense(...)
                finish() // Go back to dashboard
            }
        }
    }
}