# Linked List Matrix
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:20px">Given a Matrix <strong>mat</strong>&nbsp;of <strong>N*N</strong>&nbsp;size, the task is to complete the function <strong>constructLinkedMatrix(),</strong> that constructs a 2D linked list representation of the given matrix.</span></p>

<pre><span style="font-size:18px">Input : 2D matrix 
1 2 3
4 5 6
7 8 9

Output :
1 -&gt; 2 -&gt; 3 -&gt; NULL
|    |    |
v    v    v
4 -&gt; 5 -&gt; 6 -&gt; NULL
|    |    |
v    v    v
7 -&gt; 8 -&gt; 9 -&gt; NULL
|    |    |
v    v    v
NULL NULL NULL</span></pre>

<p><span style="font-size:20px"><strong>Input:</strong><br>
The fuction takes 2 argument as input, first the 2D matrix <strong>mat[][] </strong>and second an integer variable <strong>N</strong>, denoting the size of the matrix.<br>
There will be <strong>T</strong> test cases and for each test case the function will be called separately.<br>
<br>
<strong>Output:</strong><br>
The function must return the reference pointer&nbsp;to the head of the linked list.<br>
<br>
<strong>Constraints:</strong><br>
1&lt;=T&lt;=100<br>
1&lt;=N&lt;=150</span><br>
<br>
<strong><span style="font-size:20px">Example:<br>
Input:</span></strong><br>
<span style="font-size:20px">2<br>
3<br>
1 2 3 4 5 6 7 8 9<br>
2<br>
1 2 3 4</span><br>
<strong><span style="font-size:20px">Output:</span></strong><br>
<span style="font-size:20px">1 2 3 4 5 6 7 8 9<br>
1 2 3 4</span></p>

<p><strong>Note:</strong>The <strong>Input/Ouput</strong> format and <strong>Example</strong> given are used for system's internal purpose, and should be used by a user for <strong>Expected Output</strong> only. As it is a function problem, hence a user should not read any input from stdin/console. The task is to complete the function specified, and not to write the full code.</p>
 <p></p>
            </div>