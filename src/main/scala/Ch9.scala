
/* sfujimoto: 2017/06/17 16:36 */

object Ch9 extends App {
  def containsNeg(nums: List[Int]): Boolean = {
    var exists = false
    for (num <- nums)
      if (num < 0)
        exists = true
    exists
  }

  def containsNeg2(nums: List[Int]) = nums.exists(_ < 0)

  def containsOdd(nums: List[Int]): Boolean = {
    var exists = false
    for (num <- nums)
      if (num % 2 == 1)
        exists = true
    exists
   }
}

