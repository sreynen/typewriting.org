---
path: "/2002/11/13/what_i_learned_tonight" 
date: "2002/11/13 01:36:24" 
title: "what i learned tonight" 
---
<p>when using php...you should not recursively call a function from within a foreach loop on a global array variable and expect the foreach loop to continue after the recursive function call returns a value. this is because foreach loops depend on a pointer within the array itself, and this pointer will be reset by the first nested instance of the function to complete the loop, so that when the call returns, the original loop sees the pointer as completed and stops looping. to avoid this, you should use <tt>foreach(array_values($array) as $items)</tt>, (or something similar) which will iterate over a pointer within a local (to each instance of the funciton loop) copy of the array values.</p>