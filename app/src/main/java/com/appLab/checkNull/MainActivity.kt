package com.appLab.checkNull

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.applab.nullcheckpoint.NullCheckPoint

class MainActivity : AppCompatActivity() {

    private val tag = "null_tag"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // *---- String null checking section ----*

        //Creating a string type variable "name" & initializing with null
        var name: String? = null
        Log.d(tag, "Age value: ${NullCheckPoint.check(name)}")

        //Now in check method place some string that could return if name contains null
        Log.d(tag, "Age value: ${NullCheckPoint.check(name, "No Name entered")}")

        //If name variable has some string value then check method returns same value
        name = "John"
        Log.d(tag, "Age value: ${NullCheckPoint.check(name, "No Name entered")}")


        // *---- String null checking section ----*

        //initializing age variable with null
        var age: Int? = null
        Log.d(tag, "Age value: ${NullCheckPoint.check(age)}")

        //Now check will return zero if age contains null else it returns age value
        Log.d(tag, "Age value: ${NullCheckPoint.check(age, 0)}")

        //Now check method return 25 because now age is not null
        age = 25
        Log.d(tag, "Age value: ${NullCheckPoint.check(age, 0)}")


        // *---- checking null for Double ----*

        var height: Double? = null
        Log.d(tag, "Height value: ${NullCheckPoint.check(height)}")
        Log.d(tag, "Height value: ${NullCheckPoint.check(height, 0.0)}")

        height = 5.7
        Log.d(tag, "Height value: ${NullCheckPoint.check(height, 0.0)}")


        // *---- checking null for Long ----*

        var distance: Long? = null
        Log.d(tag, "Distance value: ${NullCheckPoint.check(distance)}")
        Log.d(tag, "Distance value: ${NullCheckPoint.check(distance, 0L)}")

        distance = 50
        Log.d(tag, "Distance value: ${NullCheckPoint.check(distance, 0L)}")


        // *---- checking null values in model class ----*

        //Let's create a model class object & input two values & two null values
        val user = User(
            "John",
            null,
            5.7,
            null
        )

        Log.d(tag, "User Data, Name: ${NullCheckPoint.check(user.name, "No Name")}")
        Log.d(tag, "User Data, Age: ${NullCheckPoint.check(user.age, 0)}")
        Log.d(tag, "User Data, Height: ${NullCheckPoint.check(user.height, 0.0)}")
        Log.d(tag, "User Data, Distance: ${NullCheckPoint.check(user.distance, 0L)}")

    }
}