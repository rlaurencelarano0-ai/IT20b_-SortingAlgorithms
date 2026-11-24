Unsa ang Gibuhat sa Akong Java Program
Ang SortingAlgorithms.java naghimo og usa ka array nga adunay dose ka mga numero ({45, 12, 89, 7, 34, 23, 90, 18, 56, 3, 72, 29}) nga wala pa mahahan-ay. Aron dili mausab ang orihinal nga listahan sa matag proseso, naghimo kini og lahi-lahing kopya para sa Bubble Sort, Selection Sort, ug Insertion Sort. Human ma-sort ang matag kopya gikan sa kinagamyan hangtod sa kinadak-an, i-print sa programa ang orihinal nga array ug ang resulta sa matag sorting algorithm.
Giunsa Pagtrabaho ang Matag Sorting Algorithm
Bubble Sort
Sa Bubble Sort, itandi ang duha ka nagtapad nga numero sugod sa unahan. Kung mas dako ang numero sa wala kaysa sa tuo, mag-ilis sila og pwesto (swap). Balik-balikon kini hangtod nga ang kinadak-ang numero sa matag hugna moabot sa tuo nga bahin, morag bula nga mosaka. Sa code, gigamit usab ang swapped flag aron kung wala nay na-ilis sa usa ka hugna, mohunong na dayon ang loop kay nahan-ay na ang tanan.
Selection Sort
Sa Selection Sort, pangitaon una ang pinakagamay nga numero sa tibuok wala pa mahuman nga bahin sa array. Pag makit-an na ang pinakagamay (minIndex), ibaylo kini ngadto sa pinakaunang pwesto sa wala pa mahuman nga bahin. Sunod, mobalhin sa sunod nga pwesto ug mangita napud og pinakagamay sa nahibilin hangtod mahuman og han-ay ang tibuok array.
Insertion Sort
Sa Insertion Sort, ang unang numero giisip na nga nahan-ay na. Kuhaon ang sunod nga numero (key), unya itandi sa mga numero sa wala niini. Kung mas dako ang numero sa wala kaysa key, i-shift kini paingon sa tuo aron mahatagan og pwesto ang key sa saktong lugar niini.
Mga Kalainan sa Tulo ka Sorting Algorithms
Ang nag-unang kalainan nila naa sa paagi sa pagtandi ug pagbalhin sa mga numero.
· Bubble Sort: Kanunay magtandi sa mga nagtapad nga numero ug mag-swap dayon kung sayop ang pwesto, busa daghan ang mahitabo nga pag-ilis og pwesto.
· Selection Sort: Mangita una sa pinakagamay nga numero sa tibuok nabilin nga bahin una mo-swap og kausa kada hugna, mao nga mas gamay ang swaps niini pero pirmi gihapon mag-scan sa nabilin nga mga elemento.
· Insertion Sort: Mag-insert sa matag numero sa saktong pwesto niini pinaagi sa pag-shift sa mga mas dagkong numero sa wala, nga kusog kaayo kung ang listahan daan nang nahan-ay o halos nahan-ay na.
Mga Tubag sa Reflection Questions
· Giunsa paghan-ay sa matag sorting algorithm ang mga numero? Unsa ang nakalahi sa ilang mga proseso?
   Ang Bubble Sort maghan-ay pinaagi sa pagtandi sa tapad nga mga numero ug pag-swap nila hangtod mosaka ang pinakadako sa tuo. Ang Selection Sort maghan-ay pinaagi sa pagpili sa pinakagamay sa nabilin nga parte ug pagbutang niini sa unahan matag hugna. Ang Insertion Sort maghan-ay pinaagi sa pagkuha sa matag numero ug pagsuksok niini sa saktong pwesto sa wala pinaagi sa pag-shift. Ang nakalahi nila mao nga ang Bubble Sort daghan og swaps sa tapad nga numero, ang Selection Sort pilion usa ang pinakagamay una mag-swap, ug ang Insertion Sort mag-shift og mga elemento aron isulod ang kasamtangang numero.
· Sa tulo ka sorting algorithms, hain ang pinakasayon sabton ug i-implement? Ngano?
   Para nako, ang Bubble Sort (o Selection Sort) ang pinakasayon sabton sa sinugdanan tungod kay diretso ra ang logic. Sa Bubble Sort, itandi ra nimo ang duha ka tapad nga numero ug i-swap kung mas dako ang naa sa wala. Dali ra pud masabtan ang Selection Sort kay mangita ra ka sa pinakagamay ug ibutang sa unahan.
· 
   Kung nahan-ay na daan ang mga numero, ang Insertion Sort (ug ang Bubble Sort tungod sa swapped flag) ang mas maayo og performance kumpara sa Selection Sort. Sa Insertion Sort, dili na kinahanglan mo-shift og mga numero kay sakto na daan ang pwesto sa matag key (arr[j] > key kay false). Sa Bubble Sort, sa unang hugna pa lang walay mahitabo nga swap (!swapped) mao nga mo-break na dayon kini. Ang Selection Sort bisan nahan-ay na ang listahan, mangita gihapon sa pinakagamay sa nabilin nga bahin sa matag hugna.
· 
   Kung dugangan og mas daghang numero ang array, modaghan usab ang pagtandi, pag-shift, ug pag-swap nga buhaton sa programa. Kay kining tulo ka algorithms naggamit og nested loops, mas modugay og samot ang paghuman sa sorting samtang nagkadako ang array, ilabi na kung daghan ang wala ma-sort o baliktad ang pagkasunod-sunod sa mga numero.

   Importante nga makabalo sa lain-laing sorting algorithms kay matag usa adunay kaugalingong kusog ug kahuyang depende sa sitwasyon ug sa klase sa datos. Kung kabalo ka kung giunsa sila motrabaho, makapili ka og pamaagi nga haom sa problema ug makatabang kini 
