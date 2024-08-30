var twoSum = function (nums, target) {
    var ans = []
    for (let i = 0; i < nums.length; i++){
        for (let j = i + 1; j < nums.length ; j++) {
            if (nums[i] + nums[j] === target) {
                ans.push(i)
                ans.push(j)
             }
         }
    }
    return ans;
};

var nums = [2, 7, 11, 15]
let target = 17
    
let ans = twoSum(nums, target)
console.log(ans);