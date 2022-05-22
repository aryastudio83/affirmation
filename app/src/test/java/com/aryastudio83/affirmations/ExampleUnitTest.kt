package com.aryastudio83.affirmations

import com.aryastudio83.affirmations.data.Datasource
import com.aryastudio83.affirmations.model.Affirmation
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */


class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val dataSource = Datasource()
        val l = dataSource.loadAffirmation()
        println(l[0])
    }
}