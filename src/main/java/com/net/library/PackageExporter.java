package com.net.library;

import java.io.File;
public class PackageExporter {
        public static void main(String[]args) {
//            String projectRoot = "path/to/project";//设置顶目根路径
            String projectRoot = "D:\\open_source_study\\gitee_project\\MANAGEMENT_PROJECT\\library-management\\library-management\\src\\main\\java\\com\\net\\library";//设置顶目根路径
            exportPackagestructure(projectRoot);
        }
            public static void exportPackagestructure(String projectRoot){
                File rootDir = new File(projectRoot);
                if (!rootDir.isDirectory()) {
                    System.out.println("Invalid project root path.");
                    return;
                }
                    File[] javaFiles = rootDir.listFiles((dir,name)->name.endsWith(".java"));
                    for (File javaFile : javaFiles) {
                        String packageName = getPackageName(javaFile);
                        createPackageDirectory(projectRoot, packageName);
                    }
                        System.out.println("Package structure exported successfully.");

                    }
                        public static String getPackageName(File javaFile) {
                        //解析门ava源文件中的包声明语句
                        //此处省略具体实现
//                            return "com.example.package";//假设解析结果为"com.exampLe.package"
                            return "com.net.library";//假设解析结果为"com.exampLe.package"

                        }
                        public static void createPackageDirectory (String projectRoot, String packageName){
                                String packagePath = packageName.replace(".",File.separator);
                                String packageDirPath = projectRoot + File.separator + packagePath;
                                File packageDir = new File(packageDirPath);
                                if (!packageDir.exists()) {
                                    packageDir.mkdirs();

                                }
                            }
                        }

