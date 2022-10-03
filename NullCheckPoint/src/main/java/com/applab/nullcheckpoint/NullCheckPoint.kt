package com.applab.nullcheckpoint

class NullCheckPoint {
    companion object {
        //--------- Checking Sting Null methods -------

        fun check(input: String?): String {
            return input ?: return "NA"
        }

        fun check(input: String?, show: String): String {
            return input ?: show
        }

        //--------- Checking Int Null methods -------

        fun check(input: Int?): Int {
            return input ?: 0
        }

        fun check(input: Int?, show: Int): Int {
            return input ?: show
        }

        //--------- Checking Long Null methods -------

        fun check(input: Long?): Long {
            return input ?: 0L
        }

        fun check(input: Long?, show: Long): Long {
            return input ?: show
        }

        //--------- Checking Double Null methods -------

        fun check(input: Double?): Double {
            return input ?: 0.0
        }

        fun check(input: Double?, show: Double): Double {
            return input ?: show
        }

        //--------- Checking Float Null methods -------

        fun check(input: Float?): Float {
            return input ?: 0f
        }

        fun check(input: Float?, show: Float): Float {
            return input ?: show
        }

        //--------- Checking Boolean Null methods -------

        fun check(input: Boolean?): Boolean {
            return input ?: false
        }

        fun check(input: Boolean?, show: Boolean): Boolean {
            return input ?: show
        }
    }
}