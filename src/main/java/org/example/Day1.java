package org.example;

import java.util.*;


public class Day1 {
    public static String PUZZLE;
    private final String listStr =
"""
80414   72092
17250   26414
23063   14603
89663   35210
27237   81657
81505   58579
67427   21819
95906   51098
19112   81697
92811   11615
13558   69095
88090   73934
78043   93679
97013   51098
61919   70291
72566   95692
35301   95381
74588   63879
85685   96855
16993   51098
76769   17580
77423   89200
71971   73934
58114   82963
53172   86048
88833   51731
77532   77433
64134   46227
76211   54394
53521   98072
33006   81657
78562   93679
71763   23743
33704   37560
72748   68417
52182   40490
58871   19269
86416   22807
92658   54533
53632   63601
65521   11026
39351   14603
53327   96729
71673   28822
79947   80534
34434   42913
72493   90961
70108   50527
75643   20937
32893   51023
95833   76926
36562   49768
93015   93096
26814   81697
47888   60992
20711   51603
30854   97280
84916   51995
87347   52804
57354   11615
27380   79353
66813   15062
26583   19269
11010   80969
49768   11026
75348   40254
51341   90357
88498   51995
87012   80829
38931   46572
60255   57830
26660   90149
22304   77433
50828   16902
58198   93679
80389   57866
95968   21832
13821   58185
54447   81657
51614   45763
21626   27821
51912   65273
67163   14099
68836   80969
93741   57830
19766   18499
53097   19238
52636   49690
96518   44386
43414   40323
42478   78230
83274   61463
10577   37309
96150   57830
61460   79316
52954   35440
86111   85469
67981   85690
89005   81697
25240   21563
52033   21832
57669   45491
91455   22543
46929   80153
46377   27335
60937   81369
51158   10062
99819   77433
98623   31360
58882   43968
51995   14603
11409   35440
81603   16993
66492   77433
57941   37767
87499   44307
24055   85469
62911   81697
88178   93096
86394   81657
90516   14780
85871   68621
81993   43091
51752   19735
69157   16533
61057   76566
11966   43965
69037   13213
13959   14603
65457   73934
59043   11823
59012   49282
77433   12025
50535   69308
44606   63296
27732   11026
57613   38704
23581   38961
77790   82219
76064   35440
82156   37240
35773   82219
62564   11615
90910   68175
20592   62481
98817   93643
21496   95618
70730   93679
42732   35096
12004   51995
60678   61719
21736   75391
49338   82219
94653   97525
15975   93679
30819   47988
32018   82262
98072   76683
48854   14603
86331   58697
27964   11615
91279   85469
85866   62179
30965   15062
73817   40254
61151   35757
65955   80212
43518   14772
74507   45177
78231   28454
58577   64754
50935   96099
20406   42556
65588   39264
83709   92854
93861   87149
89686   29388
49549   21832
77705   21931
73934   97128
11856   50527
42543   97307
43899   73636
11382   44101
80304   81697
78437   21832
67304   99462
14681   20982
26328   73934
28487   28822
20176   64754
36609   84018
87540   51731
24635   49254
24281   35329
79705   21309
76132   54958
37203   61911
92472   14603
44296   51731
88466   14613
88696   56350
99883   71141
68400   51995
43628   23867
16328   36219
27544   64508
70297   21832
20741   64754
11270   73934
10412   91984
91908   77433
38346   56835
31561   97432
94818   28401
66556   51158
98386   19269
22468   90492
39877   56803
32210   90889
36384   36321
33040   23463
26433   50527
88796   99445
89851   98072
57361   96155
93159   98072
57209   24350
74864   16993
75359   51158
85735   80267
92049   40490
38526   82756
29762   10076
22315   97525
59011   37750
47720   93096
81338   35440
99137   28822
99776   31007
66809   57830
92149   53891
82219   40693
70143   25748
11615   51731
58427   31738
57505   78654
86145   24587
50910   14603
79644   54957
53087   21832
54363   16993
42928   19269
45354   33015
78928   16533
84457   77433
16922   55466
83190   68611
66996   37945
44607   74216
25805   98578
41285   15062
48576   70411
89495   16533
86342   43664
82170   57830
97793   22785
76814   51995
80484   37096
97336   28303
43010   51158
70744   52252
47477   51731
36072   94764
13423   51002
44978   65677
23730   51384
93679   21832
90587   59127
90250   90452
27489   51731
43850   50527
74656   80969
69311   17704
43315   16533
25345   22687
66317   51731
15645   69119
47505   92406
97390   49768
40510   19269
80347   34848
82515   28822
24628   56489
73049   62481
26616   11026
96198   40254
53185   64580
43235   74362
33359   93315
70878   26005
83010   51098
45114   95350
67086   35440
57393   40583
22687   61082
90550   44094
97845   28945
21978   85054
79527   71562
44362   66635
76250   98072
33066   32780
49932   73934
45251   92545
99445   13368
93909   90723
55599   85469
51525   49768
50390   74131
11040   11026
10881   24387
50998   85469
24196   45910
18240   74337
50033   80969
91104   35077
98342   15002
85971   80969
54974   78550
81514   11026
88986   33449
77486   77130
87829   20341
67680   85469
54909   11615
91875   55985
57467   71806
58009   52471
19775   45594
68655   85646
72404   80969
41867   22896
12808   41935
94055   78793
35440   99605
99161   93096
34755   29742
15454   46732
90823   94570
38962   18692
29616   49757
22901   64168
83528   81657
85305   28094
69789   39579
90772   78280
25745   46666
14697   20975
53375   89423
99639   49768
37929   85469
49322   28822
93096   42651
90967   22687
94334   12698
73258   52012
99816   50527
27154   60418
20937   95134
45082   73934
89681   42101
76459   85469
64754   81657
86033   90176
44242   51731
13021   64971
63412   51731
21580   43974
41194   62481
44532   58882
88636   99057
52380   26629
61255   17603
63728   14603
59299   40254
65394   17790
45524   64610
66346   48648
24397   44892
25681   22437
16533   85469
13083   47222
25911   82219
84214   81657
72049   20603
91145   29744
90207   82274
22512   92421
80671   14603
17644   98072
55263   30672
40433   43484
57084   63914
85469   93679
46044   60813
83475   70576
96868   38714
30799   98072
69140   92270
84171   80867
14011   41743
59689   21832
54211   52674
56931   45258
96122   85469
49166   78240
62481   50848
52959   22687
63873   57830
41246   73934
14987   26979
20275   70933
86997   40490
50744   79436
65603   50527
93444   73200
36981   93096
64981   24188
54594   61041
86282   82588
52307   21180
12918   51098
75595   46040
46294   32809
42648   28822
76701   73934
39357   40254
85942   27672
30293   51731
14554   43239
12693   51158
11550   59887
34104   27578
96754   67543
27933   73934
65946   82117
94837   82219
98106   24903
20521   81657
21221   80969
83450   81657
14804   80969
83734   81657
88364   96906
92758   93858
18204   85469
60054   72236
42828   50527
15406   25425
87075   51731
50849   62481
17547   46079
30232   74633
15698   75417
31666   84048
13207   85469
94748   21832
29373   56737
78262   73934
47166   85469
37347   59963
55898   51731
79507   60630
78774   35440
21451   61732
65454   19269
11452   16533
73216   48418
18145   16533
16788   96041
98546   96894
26627   51995
20695   93679
56907   28871
91258   14603
92889   77433
80801   79820
78650   87646
89792   51098
31140   37748
39574   51995
39472   47554
47820   40254
59553   83504
48490   22863
36237   24165
17836   80156
46066   56588
50527   60911
51432   71880
60781   53484
38705   97525
32413   67821
45089   89333
49376   39546
86247   82219
39604   81657
74016   54438
22221   67945
93946   96880
43718   50527
89319   65059
82488   21832
91321   30928
68039   27760
44307   48197
94490   68981
30492   98072
58076   28830
85970   99445
59104   93679
14040   20232
26341   34118
57767   90744
88678   51995
50242   62481
97628   28822
33051   98699
16518   94212
84499   65860
46325   66381
93073   85469
94929   90795
98809   87400
17555   11615
47520   81657
15062   50527
64677   34270
60341   60975
51731   81697
62763   38295
82390   29395
48630   30199
84290   38436
75402   19023
90846   86436
74390   96803
66651   21832
79985   93096
88912   31428
95485   51995
23118   98757
16265   49141
81649   67346
49869   35440
93158   51098
59093   64754
16511   99342
87645   97525
66377   11615
56790   62413
14603   99445
22803   74917
54052   35440
86794   96148
68298   97921
83806   62445
41103   51995
90346   11026
10908   47695
40593   27032
15356   18518
93393   51977
81234   81463
19288   37691
43891   77296
12956   93679
14965   77433
49816   16533
45157   93437
67322   64754
72918   16210
23937   70753
46885   28822
95790   51377
84208   14603
89268   54904
52277   87223
95782   11026
61182   57830
25880   98072
83860   87571
77077   51995
18942   19269
23259   92845
74151   40254
52314   50527
36861   58339
80286   11026
93258   97890
44275   77389
70783   50527
84911   35440
35930   14603
73637   51300
87485   71404
56215   93019
36150   18658
19051   14603
10481   77574
21183   98470
23123   42289
97128   50527
77494   72477
26953   29420
70483   81657
70082   73934
86376   30969
18300   55221
69060   51158
28822   51158
67856   63185
86692   87303
34069   48760
88757   77433
64044   18260
54432   98082
30804   56595
58688   93096
43156   65419
95764   14603
81486   28372
97347   19269
51712   26094
44860   51098
87037   35437
35017   20937
77387   12156
10078   26448
93279   44307
63726   21832
67369   83232
40511   51158
53691   97128
93223   95795
27426   19269
81697   17090
17316   54745
27777   70728
97550   30918
12229   27313
19269   69194
60380   23192
95311   80969
69185   26864
28494   93679
18798   89001
42841   39339
81156   41727
32991   51174
22360   59706
72053   57590
64610   22687
92005   64610
53711   50527
84765   52351
88502   97794
81562   68859
31811   77433
31346   73934
70180   74152
57089   74609
81657   50527
56823   35440
36493   51995
58649   38164
23918   83815
13681   57020
90121   40254
46842   16533
22779   83532
27839   93096
45717   81296
83825   75953
80969   46369
22683   56089
73944   64610
94512   95236
60273   10018
66859   57905
19062   85469
51417   11816
61718   79256
37586   35440
58743   81697
64841   95937
58865   56423
42862   30261
37266   19269
63878   85469
89383   97525
89715   63237
96573   32832
52655   92032
78200   15062
83808   45700
35634   59352
24255   68324
35972   14392
90863   57830
95329   51098
10750   85614
16438   42624
86739   34480
90003   98072
12639   39303
84427   51995
51781   76152
34496   22395
58148   81657
88205   93679
50741   51098
31970   24540
35382   51731
62999   74924
83963   31234
18062   92202
45068   94970
39838   50527
71520   28822
51098   93096
32346   49768
92736   21832
43323   95658
58464   35071
88992   50527
67861   24097
79531   19269
49830   93679
78703   30705
80297   11026
69226   11026
38374   62481
21852   18593
96958   11026
38539   21832
32794   21832
78798   97003
96223   14603
26071   21832
39686   97128
26048   70606
70231   55231
58917   75113
62199   83162
96306   59205
48370   50527
36171   93679
82491   97525
63363   91017
11770   91438
63978   50527
50584   19269
42407   69422
21115   57830
32805   97525
33509   21832
93002   28822
85631   12807
48612   96336
72659   20129
55590   27170
75562   44707
85043   28822
96350   28822
64571   35440
36511   51098
24661   40332
43124   29084
19676   64396
70113   89945
84453   82219
18947   13232
18167   52449
42247   12286
84728   12361
41005   98072
97350   28822
38072   93679
93484   54511
10448   98072
41958   49768
66488   93369
12823   81697
25610   23272
10701   82219
53066   71078
82561   98411
55612   51731
90428   50462
75269   28822
99211   16533
21746   21832
73620   98072
68119   93096
64999   58289
24654   77946
60698   38604
37161   80969
34397   51731
36071   65274
17585   16533
34847   50527
15346   95704
96992   61166
55682   62481
37906   60636
77960   76522
76696   16993
29462   81657
57541   73934
27197   58945
82649   33263
48806   71171
82673   59650
59803   16533
73011   19269
66026   51995
10202   84890
91172   65178
89094   51158
18432   65001
47718   11026
58437   91038
69858   13129
17056   58882
55399   71128
35040   73934
42911   44230
49894   51634
11726   77433
96397   14603
77395   64301
74358   78432
82764   38499
31032   51731
71054   87172
15947   73934
47778   16533
84893   28628
25173   40730
81302   36351
83391   73934
91991   93308
31079   87735
42936   40548
14268   11026
64477   57830
67560   20743
92460   51995
59686   97525
34154   85838
63377   73934
81133   21118
73299   63651
76007   93096
65252   11615
78949   85469
20691   46712
37742   33435
87579   51098
42341   79376
57830   35440
23963   98072
65065   81697
13569   97128
23253   58502
13073   15200
84437   93096
13349   76696
86981   49768
77821   80969
96675   80548
16781   62487
43265   11026
50208   41915
16888   22687
24043   91896
88472   94959
85382   19679
99783   85469
99403   27105
67116   57861
33393   52212
45331   23773
67666   80972
75091   51098
59305   19269
23341   16186
84540   16533
21985   81697
22442   20937
58548   48172
24586   39588
60989   82219
51489   94798
49355   78539
33721   51098
95264   38754
87615   99445
68688   95604
89067   98089
29001   16533
69704   29016
55276   97128
34718   84612
26075   79610
60067   15029
40254   50562
57647   65952
58449   52332
32201   71785
87280   11615
38711   32023
95527   67518
46099   92649
69587   48194
45658   93096
75733   58939
67169   25661
29632   73001
39121   63650
16274   98072
40942   37221
59341   50527
86036   93096
83497   79723
27584   20569
21832   79777
43372   80969
16285   51158
59831   11615
54308   21832
15628   30242
98622   54345
97525   16533
18812   36681
80016   51731
52911   93600
73344   51098
33175   73934
76871   18284
17972   25169
94667   98072
19957   80752
18041   42293
97729   98072
48346   51098
80107   81657
96427   94327
59255   62929
15990   56754
51088   60450
93825   18701
44800   93096
69429   99445
16217   11615
92925   17693
12635   73124
46330   98072
76616   14603
99731   16226
40490   79655
10872   79082
18341   14603
14770   11026
99497   81733
94474   51995
36510   11615
16051   81657
12265   61581
74626   14603
10154   64754
84889   39769
78236   46325
89093   21025
79570   14603
77063   62481
71084   51731
81110   91132
83055   81653
99853   73129
11026   93772
38393   85469
63863   51995
55502   72766
94404   28822
62772   51158
69487   20471
""";

    public Day1(String puzzle) {
        PUZZLE = Objects.requireNonNullElse(puzzle, listStr);
    }

    public void solvePartOne() {

        String[] IDs = PUZZLE.split("\n");
        List<String> lines = new ArrayList<>();
        // filter empty lines
        for (String line : IDs) {
            if (!line.isEmpty()) {
                lines.add(line);
            }
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (String line : lines) {
            String[] ids = line.split(" {3}");
            list1.add(Integer.parseInt(ids[0]));
            list2.add(Integer.parseInt(ids[1]));
        }
        list1 = list1.stream().sorted().toList();
        list2 = list2.stream().sorted().toList();
        int res = 0;
        for (int i = 0; i < list1.size(); i++) {
            res += Math.abs( list1.get(i) - list2.get(i) );
        }
        System.out.println("The sum is: " + res);
    }

    public void solvePartTwo() {

        String[] IDs = PUZZLE.split("\n");
        List<String> lines = new ArrayList<>();
        // filter empty lines
        for (String line : IDs) {
            if (!line.isEmpty()) {
                lines.add(line);
            }
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (String line : lines) {
            String[] ids = line.split(" {3}");
            list1.add(Integer.parseInt(ids[0]));
            list2.add(Integer.parseInt(ids[1]));
        }
        int res = 0;
        for(int number : list1) {
            List<Integer> containsNum = list2.stream().filter(x -> x == number).toList();
            res += number * containsNum.size();
        }
        System.out.println("The similarity score is: " + res);
    }
}
