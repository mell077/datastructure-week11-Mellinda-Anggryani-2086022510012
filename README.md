4.3h Under what conditions would a pre-order and a breadth-first traversal be the same?
jawaban:Pre-order traversal dan breadth-first traversal akan menghasilkan urutan yang sama hanya jika setiap node dalam tree memiliki paling banyak satu anak (artinya strukturnya seperti garis lurus, bukan bercabang).

4.3i Suppose a directory structure has N files stored in n directories. Answer the following questions:
a. What is the run time of a traversal that prints out the directory names?
jawaban: Waktu yang dibutuhkan untuk traversal yang mencetak nama direktori adalah O(n), karena traversal harus mengunjungi setiap direktori satu per satu, dan jumlah direktori adalah n.
b. What is the run time of a traversal that prints out the file names?
jawaban: Waktu yang dibutuhkan untuk traversal yang mencetak nama file adalah O(N), karena traversal harus menemukan dan mencetak setiap file, dan jumlah file adalah N.