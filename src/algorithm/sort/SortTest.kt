package algorithm.sort

/**
 * Created by yonghoon on 2017-06-29
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
fun main(args: Array<String>) {
    var arr = arrayOf(4, 2, 3, 1, 5)

    SelectSort().sort(arr, {a, b -> a > b})
}