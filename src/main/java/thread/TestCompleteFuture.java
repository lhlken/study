package thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.function.*;
import java.util.function.Consumer;

public class TestCompleteFuture {

    public static void main(String[] args) {

//        tea();
        then();
        and();
        or();
        exception();
    }

    public static void exception() {

        exceptionally();
//        whenComplete();
//        handle();
    }

    public static void handle() {
        CompletableFuture f1 = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                int c = 1/0;
            }
        });

        f1.handle(new BiFunction() {
            /**
             * Applies this function to the given arguments.
             *
             * @param o  the first function argument
             * @param o2 the second function argument
             * @return the function result
             */
            @Override
            public Object apply(Object o, Object o2) {
                System.out.println("ss"+o);
                System.out.println("sss"+o2);
                return o2;
            }

        });
        f1.join();
        try {
            System.out.println("tt"+f1.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    public static void whenComplete() {
        CompletableFuture f1 = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                int c = 1/0;
            }
        });

        f1.whenComplete(new BiConsumer() {
            /**
             * Performs this operation on the given arguments.
             *
             * @param o  the first input argument
             * @param o2 the second input argument
             */
            @Override
            public void accept(Object o, Object o2) {
                System.out.println("ss"+o);
                System.out.println("sss"+o2);
            }

        });
        f1.join();
    }

    public static void exceptionally() {
        CompletableFuture f1 = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                int c = 1/1;
            }
        });

        f1.exceptionally(new Function() {
            @Override
            public Object apply(Object o) {
                System.out.println(o);
                return null;
            }
        });
        f1.join();
    }

    public static void then() {
//        thenApply();
//        thenAccept();
//        thenRun();
//        thenCompose();
    }

    public static void and() {
//        thenCombine();
//        thenAcceptBoth();
//        thenAfterBoth();
    }

    public static void or() {
//        orAfterEither();
//        orAcceptEither();
//        orApplyEither();
    }

    public static void orApplyEither() {
        CompletableFuture f1 = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                sleep(1,"aaaaa");
                System.out.println(1111111);
            }
        });

        CompletableFuture f2 = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                sleep(10,"bbbbb");
                System.out.println(2222222);
            }
        });

        CompletableFuture f3 = f1.applyToEither(f2, new Function() {
            /**
             * Applies this function to the given argument.
             *
             * @param o the function argument
             * @return the function result
             */
            @Override
            public Object apply(Object o) {
                sleep(1,"cccccc");
                return 333333;
            }


        });
        f3.join();
        try {
            System.out.println(f3.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    public static void orAcceptEither() {
        CompletableFuture f1 = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                sleep(1,"aaaaa");
                System.out.println(1111111);
            }
        });

        CompletableFuture f2 = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                sleep(1,"bbbbb");
                System.out.println(2222222);
            }
        });

        CompletableFuture f3 = f1.acceptEither(f2, new java.util.function.Consumer() {
            /**
             * Performs this operation on the given argument.
             *
             * @param o the input argument
             */
            @Override
            public void accept(Object o) {
                System.out.println(3333);
            }

        });
        f3.join();
    }

    public static void orAfterEither() {
        CompletableFuture f1 = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                sleep(1,"aaaaa");
                System.out.println(1111111);
            }
        });

        CompletableFuture f2 = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                sleep(1,"bbbbb");
                System.out.println(2222222);
            }
        });

        CompletableFuture f3 = f1.runAfterEither(f2, new Runnable() {
            @Override
            public void run() {
                System.out.println(3333);
            }
        });
        f3.join();
    }

    public static void thenRun() {
        CompletableFuture f1 = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                sleep(1,"aaa");
                System.out.println("111");
            }
        });
        CompletableFuture f2 = f1.thenRun(new Runnable() {
            @Override
            public void run() {
                sleep(1,"bbb");
                System.out.println("222");
            }
        });
        f2.join();

    }

    public static void thenApply() {
        CompletableFuture f1 = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                sleep(1,"aaa");
                System.out.println("111");
            }
        });
        CompletableFuture f2 = f1.thenApply(new Function() {
            /**
             * Applies this function to the given argument.
             *
             * @param o the function argument
             * @return the function result
             */
            @Override
            public Object apply(Object o) {
                sleep(1,"bbb");
                return "222";
            }

        });
        f2.join();
        try {
            System.out.println(f2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

    public static void thenCompose() {
        CompletableFuture f1 = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                sleep(1,"aaa");
                System.out.println("111");
            }
        });
        CompletableFuture f2 = f1.thenCompose(new Function() {

            /**
             * Applies this function to the given argument.
             *
             * @param o the function argument
             * @return the function result
             */
            @Override
            public Object apply(Object o) {
                sleep(1,"bbb");

                return CompletableFuture.supplyAsync(new Supplier<Object>() {
                    /**
                     * Gets a result.
                     *
                     * @return a result
                     */
                    @Override
                    public Object get() {
                        return "222";
                    }
                });
            }

        });
        f2.join();
        try {
            System.out.println(f2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

    public static void thenAccept() {
        CompletableFuture f1 = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                sleep(1,"aaa");
                System.out.println("111");
            }
        });
        CompletableFuture f2 = f1.thenAccept(new Consumer() {
            /**
             * Performs this operation on the given argument.
             *
             * @param o the input argument
             */
            @Override
            public void accept(Object o) {
                sleep(1,"bbb");
                System.out.println("222");
            }


        });
        f2.join();
    }



    public static void sleep(int n,String msg) {
        try {
            System.out.println(msg);
            Thread.sleep(n * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void thenCombine() {
        CompletableFuture f1 = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                sleep(1,"aaa");
                System.out.println("111");
            }
        });

        CompletableFuture f2 = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                sleep(1,"bbb");
                System.out.println("222");
            }
        });

        CompletableFuture f3 = f1.thenCombine(f2,new BiFunction() {
            /**
             * Applies this function to the given arguments.
             *
             * @param o  the first function argument
             * @param o2 the second function argument
             * @return the function result
             */
            @Override
            public Object apply(Object o, Object o2) {
                sleep(1,"ccc");
                return "333";
            }
        });
        try {
            System.out.println(f3.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

    public static void thenAcceptBoth() {
        CompletableFuture f1 = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                sleep(1,"aaa");
                System.out.println("111");
            }
        });

        CompletableFuture f2 = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                sleep(1,"bbb");
                System.out.println("222");
            }
        });

        CompletableFuture f3 = f1.thenAcceptBoth(f2,new BiConsumer() {
            /**
             * Performs this operation on the given arguments.
             *
             * @param o  the first input argument
             * @param o2 the second input argument
             */
            @Override
            public void accept(Object o, Object o2) {
                sleep(1,"ccc");
                System.out.println("333");
            }

        });
        f3.join();
    }

    public static void thenAfterBoth() {
        CompletableFuture f1 = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                sleep(1,"aaa");
                System.out.println("111");
            }
        });

        CompletableFuture f2 = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                sleep(1,"bbb");
                System.out.println("222");
            }
        });

        CompletableFuture f3 = f1.runAfterBoth(f2,new Runnable() {
            /**
             * When an object implementing interface <code>Runnable</code> is used
             * to create a thread, starting the thread causes the object's
             * <code>run</code> method to be called in that separately executing
             * thread.
             * <p>
             * The general contract of the method <code>run</code> is that it may
             * take any action whatsoever.
             *
             * @see Thread#run()
             */
            @Override
            public void run() {
                sleep(1,"ccc");
                System.out.println("333");
            }

        });
        f3.join();
    }

    public static void tea() {
        CompletableFuture f1 = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                sleep(1,"洗水壶");
                sleep(10,"烧开水");
            }
        });

        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(new Supplier<String>() {
            /**
             * Gets a result.
             *
             * @return a result
             */
            @Override
            public String get() {
                sleep(1,"洗茶壶");
                sleep(1,"拿茶叶");
                return "龙井";
            }
        });

        CompletableFuture<String> f3 = f1.thenCombine(f2,new BiFunction() {
            /**
             * Applies this function to the given arguments.
             *
             * @param o  the first function argument
             * @param o2 the second function argument
             * @return the function result
             */
            @Override
            public String apply(Object o, Object o2) {
                try {
                    System.out.println("拿到："+f2.get());
                    sleep(1,"泡茶...");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
                return "上茶";
            }
        });

//        f3.join();
        try {
            System.out.println(f3.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
