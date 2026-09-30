迷你compiler：三個整數的加法敘述轉成 Mini-3 assembly

輸入：
int result = 12 + 17 + 18 ;

輸出：
MOVI R1, 12
MOVI R2, 17
ADD R0, R1, R2
MOVI R2, 28
ADD R0, R0, R2
STORE [0], R0

回答一：因為第一次加完的結果存成R0了，原本的R2空下來了
回答二：因為scanner需要空格才能個別讀取